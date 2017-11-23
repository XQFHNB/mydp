package com.xqf.pattern.decorator;

public class Decorator extends Girl {

    @Override
    public void getDesc() {
        System.out.println("I am a complete Chinese girl");
    }
}


class BlondeHair extends Decorator {
    String str = "blondehair";
    Girl mGirl;

    public BlondeHair(Girl girl) {
        mGirl = girl;
        System.out.println("add a appearance " + str);
    }

}

class BlackHair extends Decorator {
    String str = "blackhair";

    Girl mGirl;

    public BlackHair(Girl girl) {
        mGirl = girl;
        System.out.println("add a appearance " + str);
    }


}

class Tall extends Decorator {

    String str = "tall";

    Girl mGirl;

    public Tall(Girl girl) {
        mGirl = girl;
        System.out.println("add a appearance " + str);
    }
}


class BlueEye extends Decorator {

    String str = "blueeye";


    Girl mGirl;

    public BlueEye(Girl girl) {
        mGirl = girl;
        System.out.println("add a appearance " + str);
    }
}

class BlackEye extends Decorator {

    String str = "blackeye";
    Girl mGirl;

    public BlackEye(Girl girl) {
        mGirl = girl;
        System.out.println("add a appearance " + str);
    }
}