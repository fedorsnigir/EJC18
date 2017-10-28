package homework3.quack;

class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
