package homework1.StringArray;

public class SimpleStringBufferUsage {


    public void bufferUsage() {
        Student temp = new Student();
        Student temp1 = new Student();
        Student temp2 = new Student();
        Student temp3 = new Student();
        Student temp4 = new Student();
        Student temp5 = new Student();
        Student arr[] = {temp,temp1,temp2,temp3,temp4,temp5};
        StringBuffer tempBuffer = new StringBuffer();
        for (Student stud:arr) {
            tempBuffer.append("Name: ");
            tempBuffer.append(stud.getName());
            tempBuffer.append("\nId: ");
            tempBuffer.append(stud.getId());
            tempBuffer.append("\n\n");
        }
        String res = tempBuffer.toString();
        System.out.println(res);


    }
}

class Student {
    static String abc = "abcdefghijklmnopqrstuvwxyz";
    static String ids = "0123456789";

    String name;
    String id;

    public Student() {
        name = "";
        int i = (int)  ((Math.random() * ((10 - 3) + 1)) + 3);
        for (;i > 0;i--)
            name += abc.charAt(random(0,25));
        id = "";
        for (i = 8;i > 0;i--){
            id += ids.charAt(random(0,9));
        }

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    private int random(int min, int max){
        return  (int) ((Math.random() * ((max - min) + 1)) + min);
    }

}

