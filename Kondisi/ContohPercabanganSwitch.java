public class ContohPercabanganSwitch {

    public static void main(String args[]) {
         
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Perpect");
                break;
            case 'B':
                System.out.println("Nice");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        System.out.println("your grade is +"+ grade);
    }
}