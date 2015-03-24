package norg.nosite.morse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alexey Radionenko
 * 3/23/2015
 */
public class MorseCoder {

    private static final Map<Character, MorseSign[]> MORSE_CODE = new HashMap<Character, MorseSign[]>();
    static {
        //кириллица
        MORSE_CODE.put('А', new MorseSign[]{MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Б', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('В', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Г', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Д', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('Е', new MorseSign[]{MorseSign.DOT});
        MORSE_CODE.put('Ж', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('З', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('И', new MorseSign[]{MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('Й', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('К', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Л', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('М', new MorseSign[]{MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Н', new MorseSign[]{MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('О', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('П', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Р', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('С', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('Т', new MorseSign[]{MorseSign.DASH});
        MORSE_CODE.put('У', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Ф', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Х', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('Ц', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Ч', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Ш', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Щ', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Ъ', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Ы', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Ь', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Э', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('Ю', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('Я', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        //латиница
        MORSE_CODE.put('A', new MorseSign[]{MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('B', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('W', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('G', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('D', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('E', new MorseSign[]{MorseSign.DOT});
        MORSE_CODE.put('V', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Z', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('I', new MorseSign[]{MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('J', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('K', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('L', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('M', new MorseSign[]{MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('N', new MorseSign[]{MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('O', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('P', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('R', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('S', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('T', new MorseSign[]{MorseSign.DASH});
        MORSE_CODE.put('U', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('F', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('H', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('C', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('Q', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('Y', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('X', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        //цифры
        MORSE_CODE.put('1', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('2', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('3', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('4', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('5', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('6', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('7', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('8', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('9', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('0', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH});
        //символы
        MORSE_CODE.put('.', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put(',', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put(':', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put(';', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('(', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put(')', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('\'', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('\"', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('-', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH});
        MORSE_CODE.put('/', new MorseSign[]{MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
        MORSE_CODE.put('?', new MorseSign[]{MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT});
        MORSE_CODE.put('!', new MorseSign[]{MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DOT, MorseSign.DASH, MorseSign.DASH});
        MORSE_CODE.put('@', new MorseSign[]{MorseSign.DOT, MorseSign.DASH, MorseSign.DASH, MorseSign.DOT, MorseSign.DASH, MorseSign.DOT});
    }

    public static MorseSign[] getMorseSigns(char symbol){

        return MORSE_CODE.get(symbol);

    }

    public static String doDisplay(MorseSign sign){

        if(sign.equals(MorseSign.DASH))
            return MorseSign.DASH.display() + " ";
        else if(sign.equals(MorseSign.DOT))
            return MorseSign.DOT.display() + " ";

        return "";

    }

    public static void doSound(MorseSign sign){

        if(sign.equals(MorseSign.DASH))
            MorseSign.DASH.sound();
        else if(sign.equals(MorseSign.DOT))
            MorseSign.DOT.sound();

    }

}
