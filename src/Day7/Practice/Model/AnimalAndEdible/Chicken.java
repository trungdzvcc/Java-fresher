package Day7.Practice.Model.AnimalAndEdible;

import Day7.Practice.Interface.Edible;

public class Chicken extends  Animal implements Edible {
    @Override
    public String makeSound()  {
        return "Chicken Ooooo";
    }

    @Override
    public String howToEat() {
        return "BBQ chicken";
    }
}
