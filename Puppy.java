public class Puppy{
    int PuppyAge;
    public Puppy(String name){
        // 这个构造器仅有一个参数: name
        System.out.println("小狗的名字是: " + name);
    }

    public void setAge(int age){
        PuppyAge = age;
    }

    public int geyAge(){
        System.out.println("小狗的年龄为：" + PuppyAge);
        return PuppyAge;
    }

    public static void main(String[] atgs){
        /* 创建对象 */
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age */
        myPuppy.setAge(2);
        /* 调用另一个方法获取age */
        myPuppy.geyAge();
        System.out.println("变量值: " + myPuppy.PuppyAge);
    }
}