package my.praktikums;


import com.sun.istack.internal.NotNull;

public class Female extends Person {

    public static final Female DEFAULT = new Female() {
        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }

        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }

    };

    public Female(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);
    }

    public Female(String name) {
        this.name = name;
        this.father = Male.DEFAULT;
        this.mother = Female.DEFAULT;
    }

    private Female(){
        super("Невідома");
    }
}