package com.homework3;

public class CheckDogState {
    public static void main(String[] args) {
        Dog yellowDog=new Dog();
        yellowDog.setState(new SoftlytState());
        yellowDog.show();
        yellowDog.setState(new MeetEnemyState());
        yellowDog.show();
        yellowDog.setState(new MeetFriendState());
        yellowDog.show();
        yellowDog.setState(new MeetAnotherDog());
        yellowDog.show();
    }
}
interface DogState{
    public void showState();
}
class SoftlytState implements DogState{

    @Override
    public void showState() {
        System.out.println("狗在主人面前:听主人的命令!");
    }
}
class MeetEnemyState implements DogState{

    @Override
    public void showState() {
        System.out.println("狗遇到敌人：狂叫，并冲上去狠咬敌人!");
    }
}
class MeetFriendState implements DogState{

    @Override
    public void showState() {
        System.out.println("狗遇到朋友：晃动尾巴，表示欢迎!");
    }
}
class MeetAnotherDog implements DogState{

    @Override
    public void showState() {
        System.out.println("狗遇到同伴：嬉戏");
    }
}
class Dog{
    DogState state;
    public void show(){
        state.showState();
    }

    public void setState(DogState state) {
        this.state = state;
    }
}
