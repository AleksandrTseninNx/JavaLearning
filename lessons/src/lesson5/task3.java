package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Написать программу обработки чата.
Есть список nicknames:
Ник1
Ник2
Ник3
...
НикN
Дан диалог из общего чата в формате:
Ник1: текст
Ник2: текст
...
Вывести список высказываний каждого nickname с порядковым номер высказывания в чате.
Обратите внимание:
    • содержимое чата может содержать много строк;
    • ник может встречаться в строке более одного раза, в том числе с двоеточием;
    • один ник может быть префиксом другого ника (например, "xxx" и "xxx xxxx").
Код оформить в виде метода:
private String printNickChatting(String[] nickNames, String[] textLines) {
    // ваш код
}
 */
public class task3 {
    public static void main(String[] args) {
        String[] nickNames = {"xxx", "yyy", "СССР", "шпак","Людмила" };
        String[] textLines = {
                "xxx: ну как там твой интровертный карантинный рай?)   ",
                "yyy: ну вот представь ",
                "yyy: все экстраверты сидят по домам   ",
                "yyy: и ещё и работу у большинства отменили    ",
                "yyy: так что теперь им не хватает общения и все они ежедневно пишут всем своим контактам( ",
                "yyy: серьёзно, я никогда так часто не переписывалась с большинством своих коллег, родственников и друзей  ",
                "yyy: как вторая работа, блин( ",
                "шпак: Как то забавно получилось? Вирус привезли богатые на самолётах, а расплачиваться как всегда бедным? ",
                "Людмила: Юристы есть в чате? Очень нужен совет..  ",
                "СССР: Тут только вирусологи. Ты пиши вопрос сразу. Вдруг был случай, разберём ",
                "xxx: кажется я постарел ) ",
                "xxx: не могу найти выход из стартовой локации в игре )    ",
                "yyy: Ахахахаха    ",
                "xxx: я даже кнопку выход там не нашел, как старпер вышел по Alt+F4    "};
        System.out.print(printNickChatting(nickNames, textLines));
    }
    private static String printNickChatting(String[] nickNames, String[] textLines) {
        // ваш код
        LinkedHashMap<String, String> myHashMap = new LinkedHashMap<String, String>();
        for(int i=0;i<nickNames.length;i++){
            myHashMap.put(nickNames[i],"");
            for(int j=0;j<textLines.length;j++){
                if(textLines[j].contains(nickNames[i])){
                    myHashMap.put(Integer.toString(j+1),textLines[j]);
                }
            }
        }
        return myHashMap.toString();
    };
}
