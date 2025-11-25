package org.example.designpattern.iterator;

/**
 * @author Saaidalo Shamsiyev
 */
public class IteratorTest {
    public static void main(String[] args) {

        NameCollection collection = new NameCollection();

        Iterator<String> iterator = collection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /**
         *  Agar iterator bo'lmasa edi quyidagicha yozishimiz kerak bo'lardi
         *  Yani biza collection ichidagi elementlarga to'g'ridan to'g'ri murojaat qilishimiz kerak bo'lardi
         *  Bu esa encapsulation (ma'lumotlarni yashirish) prinsipiga zid bo'ladi
         */

//        for (int i = 0; i < collection.items.length; i++) {
//            System.out.println(collection.items[i]);
//        }


    }
}
