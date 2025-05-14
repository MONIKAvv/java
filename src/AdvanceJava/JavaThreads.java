package AdvanceJava;

//public class JavaThreads {
//    public static void main(String[] args) {
//
//        Javathreading thread = new Javathreading();
//        thread.start();
//        System.out.println("The code is outside of the thread now");
//        thread.display();
//        RunnableThread thread2 = new RunnableThread();
//        Thread threadobj = new Thread(thread2);
//        threadobj.start();
////        thread2.run();
//
//
//
//
//
//    }
//}

class Javathreading extends Thread {
    static int amount = 0;
    public static void main(String[] args) {


        Javathreading thread = new Javathreading();
        thread.start();
        System.out.println("Alive method is runnung");
        while (thread.isAlive()){
            System.out.println("waiting....");
        }

        amount++;
        System.out.println(amount);


    }

    public void run() {
        System.out.println("Thread is running ");
        amount++;
        System.out.println("Thread increases values "+amount);
    }
    void display(){
        System.out.println("What is this man");
    }
}

class RunnableThread implements Runnable{
//    passing the instance of the class to the thread object
    @Override
    public void run() {
        System.out.println("This is Runnable interface ");
    }
}



/*
Threads:- Threads is used to increase the efficiecy of the Operations by performing multiple small tasks at the same time
          Threads works in background and doesn't effect on the performance of the code in front that is without interrupting the main program

          Threads can be implemented by extending the Thread class or overridding the run();
          Another way to make thread is to implement the runnable interface

What is the differences between using the extanding thread and implementing thread
         If you extends the thread then we cannot extends any other classes and if we use the interface that is implementing the threads then
         we can extends others classes as well along with the implementation of the Runnable()

There is some problem called concurrency problem
          That is as we know that threads runs at same time as main runs , and if there are cases that main and thread uses the same variable for
          reading or writing purpose then the result will be unpredictable , and hence this problem called concurrency problem

This could be solved using isAlive() as sharing some attributes to the threads

 */