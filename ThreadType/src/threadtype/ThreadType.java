//// Implementing Thread Class
//class ThreadType extends Thread
//{
//    public void run()
//    {
//        System.out.println("This is Thread class");
//    }
//    
//    public static void main(String[] args)
//    {
//        ThreadType t = new ThreadType();
//        t.start();
//    }
//}

//Implementing interface runnable

class ThreadType implements Runnable
{
    public void run()
    {
        System.out.println("This is interface runnable");
    }
    
    public static void main(String[] args)
    {
        ThreadType t = new ThreadType();
        Thread th = new Thread(t);
        th.start();
    }
}