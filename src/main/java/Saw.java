public class Saw extends Tool {
    private int length;
    Saw(int _weight,int _length){
        length = _length;
        weight = _weight;
    }
    public static void Cut(String _Form){
        _Form = "Форма изменена пилой";
        Hervesting.Form = _Form;
    }
}
