class Animal {
}

class Horse extends Animal {
    private Halter myHalter = new Halter();

    public void tie(String rope) {
        myHalter.tie(rope); // Delegate tie behavior to the
        // Halter object
    }
}

class Halter {
    public void tie(String aRope) {
        // Do the actual tie work here
    }
}