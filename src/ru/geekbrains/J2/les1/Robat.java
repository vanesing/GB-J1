package ru.geekbrains.J2.les1;

class  Robat extends Runners implements RunnigTrack,Wall {


    public Robat(int jump, int run, String name) {
        this.jump = jump;
        this.rundistanse = run;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " " + "бежит " + rundistanse + " " + "Метров");
    }

    @Override
    public void jumpingOver() {
        if (jump<3){
            System.out.println(name + " " + "не перепрыгнул стену" );

        } else {
            if (jump > 3) {
                System.out.println(name + " " + "перепрыгнул стену");
            }
        }
    }
}
