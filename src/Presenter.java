import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Presenter {
    View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void run(){
        view.print("Введите данные в произвольном порядке, разделенные пробелом" +
                "Фамилия Имя Отчество датарождения номертелефона пол:");
        String s = view.read();
        boolean successRead = false;
        Person person = null;
        try{
            person = parseData(s);
            successRead = true;
        } catch (DataVolumeException e){
            if (e.getCurrentVolume() < 6)
                view.print("Введено меньше данных, чем требуется: " + e.getCurrentVolume() + " вместо 6");
            else
                view.print("Введено больше данных, чем требуется: " + e.getCurrentVolume() + " вместо 6");
        } catch (BirthDateFormatExeption e){
            view.print("Неверный формат даты. Требуется строка формата dd.mm.yyyy");
        }catch (WrongGenderException e){
            view.print("Неверный обозначение пола. Допустимые обозначения: f или m");
        } catch (PhoneNumberException e){
            view.print("В номере телефона должны быть только цифры");
        }

        if(successRead){
            try{
                saveDataToFile(person);
            } catch (IOException e){
                view.print("Ошибка при сохранени в файл");
                e.printStackTrace();
            }
        }
    }

    public Person parseData(String inputData) throws DataVolumeException, BirthDateFormatExeption, WrongGenderException, PhoneNumberException {
        Person person = new Person();
        String[] splitData = inputData.split("\\s+");
        if(splitData.length != 6){
            throw new DataVolumeException(splitData.length);
        }
        for (String item : splitData){
            if(item.length() == 1 && person.getGender() != 'f' && person.getGender() != 'm'){
                char c = item.charAt(0);
                if(c == 'f' || c == 'm')
                    person.setGender(c);
                else {
                    throw new WrongGenderException();
                }
            }
            else if(item.contains(".")){
                int firstDotIndex = item.indexOf('.');
                if(firstDotIndex == 0){
                    throw new BirthDateFormatExeption();
                }
                String subItem = item.substring(firstDotIndex + 1);
                if(!subItem.contains(".") || subItem.indexOf('.') == firstDotIndex + 1)
                    throw new BirthDateFormatExeption();
                person.setBirthDate(item);
            }
            else if(TryParsePhoneNumber(item)){
                person.setPhoneNumber(Integer.parseInt(item));
            }
            else {
                if(person.getName() == null){
                    person.setName(item);
                }
                else if(person.getSurname() == null){
                    person.setSurname(item);
                }
                else if(person.getPatronymic() == null){
                    person.setPatronymic(item);
                }
                else {
                    throw new PhoneNumberException();
                }
            }
        }
        return person;
    }

    public void saveDataToFile(Person person) throws IOException{
        String filename = person.getSurname() + ".txt";
        File file = new File(filename);
        if(!file.exists()) {
            file.createNewFile();
        }
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write("<"+ person.getSurname() + "><"+person.getName()+
                    "><"+person.getPatronymic()+"><"+person.getBirthDate()+
                    "><"+person.getPhoneNumber()+"><"+person.getGender()+">\n");
        }
    }
    private boolean TryParsePhoneNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
