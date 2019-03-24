public class Worker {
    View view = new View();
    private String name;
    Worker(String _name){
        name = _name;
    }
    public  void Work(String method){
        if(method == view.getChip())
            Plane.Chip(Hervesting.Form);
        if(method == view.getCut())
            Saw.Cut(Hervesting.Form);
        if(method == view.getScrewdriver())
            Srewdriv.Unleash();
        else Srewdriv.Twist();
    }
}
