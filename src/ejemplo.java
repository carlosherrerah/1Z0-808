interface Bounceable {
    void bounce();
}
interface Inflatable {
    void inflate();
}

class Ball {
}

class BeachBall extends Ball implements Bounceable, Inflatable {
    @Override
    public void bounce() {
        System.out.println("The beach ball bounces!");
        return;
    }

    @Override
    public void inflate() {
        System.out.println("Unimplemented method 'inflate'");
        return;
    }
}


