package _21_design_pattern.practice.factory_method;

public class Cat extends Animal{
    @Override
    public String makeSound() {
        return "Meow";
    }
}
