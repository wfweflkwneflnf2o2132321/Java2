package Dz5;

public class HomeWork5 {
    static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        Thread clock = new Thread(new Worker.Clock(worker));
        clock.start();
        Thread message = new Thread(new Worker.Messanger(worker));
        message.start();
        Thread clock1 = new Thread(new Worker.Clock1(worker));
        clock1.start();
        Thread message1 = new Thread(new Worker.Messanger1(worker));
        message1.start();


    }

}


class Worker {
    int minutes = 0;
    int seconds = 0;

    public void Clock() {
        synchronized (Test.lock) {
            System.out.println(minutes + ":" + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            while (seconds % 5 == 0) {
                try {
                    System.out.println(minutes + ":" + seconds);
                    Test.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            Test.lock.notify();

        }

    }

    public void message() {
        synchronized (Test.lock) {
            while (seconds % 5 != 0) {
                try {
                    Test.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            seconds++;
            System.out.println("HELLO)))");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Test.lock.notify();
        }
    }


    static class Clock implements Runnable {
        Worker worker;

        public Clock(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void run() {
            while (true) {
                worker.Clock();
            }
        }
    }

    static class Messanger implements Runnable {
        Worker worker;

        public Messanger(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void run() {
            while (true) {
                worker.message();
            }
        }
    }


    public void Clock1() {
        synchronized (Test.lock) {
            System.out.println(minutes + ":" + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            while (seconds % 7 == 0) {
                try {
                    System.out.println(minutes + ":" + seconds);
                    Test.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Test.lock.notify();
        }
    }

    public void message1() {
        synchronized (Test.lock) {
            while (seconds % 7 != 0) {
                try {
                    Test.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            seconds++;
            System.out.println("GOODBYE)))");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Test.lock.notify();
        }
    }


    static class Clock1 implements Runnable {
        Worker worker;

        public Clock1(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void run() {
            while (true) {
                worker.Clock();
            }
        }
    }


    static class Messanger1 implements Runnable {
        Worker worker;

        public Messanger1(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void run() {
            while (true) {
                worker.message();
            }
        }
    }
}









