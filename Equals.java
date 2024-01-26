public class Equals {
    public static void main(String[] args) {
        Pizza one = new Pizza();
        Pizza two = new Pizza();

        System.out.println(one == two);
        System.out.println(one.Equils(two));

    }

}

class Pizza {
    int size;
    String toppings;

    public boolean Equils(Object o) {
        Pizza other = (Pizza) o;
        if (this.size == other.size) {
            if (this.toppings == other.toppings) {
                return true;
            }

        }
        return false;
    }




    @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;

    result = prime * result + size;

    if (toppings == null) {
        result = prime * result + 0;
    } else {
        result = prime * result + toppings.hashCode();
    }

    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Pizza other = (Pizza) obj;

    if (size != other.size) {
        return false;
    }

    if (toppings == null) {
        return other.toppings == null;
    } else if (!toppings.equals(other.toppings)) {
        return false;
    }

    return true;
}
}


