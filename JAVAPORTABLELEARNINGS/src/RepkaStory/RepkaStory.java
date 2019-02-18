package RepkaStory;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
            /*
             * проверьте: имя объекта, вызывающего метод pull, мы получаем напрямую (this.name), 
             * а имя переданного объекта person - через вызов его метода. 
             */
        }
    }
}
