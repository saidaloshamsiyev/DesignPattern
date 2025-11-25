package org.example.designpattern.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String name;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String role;
    private String address;


    /**
     * Bu yerda Consturcot Telescoping muammosi yuzaga keladi
     * Yani hamma parametrlarni berish majburiy bo'ladi lekin bizaga hamma
     * parametrlar kerak bo'lmasligi mumkin
     * lekin constructor chaqirilganda hamma parametrlarni berishimiz kerak bo'ladi
     * bu juda noqulaylik tug'diradi
     * buning oldini olish uchun BUILDER PATTERN  ishlatiladi
     *
     * @param name
     * @param username
     * @param fullName
     * @param email
     * @param password
     * @param role
     * @param address
     */
    public User(String name, String username, String fullName, String email, String password, String role, String address) {
        this.name = name;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
    }


    /**
     * Bu builder() metodi orqali biz User obyektini yaratishda
     * kerakli parametrlarni berishimiz mumkin bo'ladi
     *
     * @return Builder();
     */
    public static Builder builder() {
        return new Builder();
    }


    /**
     * Bu yerda Builder klassi ichida User klassining
     * kerakli parametrlarini berish uchun metodlar mavjud
     * va oxirida build() metodi orqali User obyektini qaytaradi
     */

    public static class Builder {
        private String name;
        private String username;
        private String fullName;
        private String email;
        private String password;
        private String role;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this.name, this.username, this.fullName, this.email, this.password, this.role, this.address);
        }
    }


    public static void main(String[] args) {
        User user = User.builder()
                .name("John")
                .username("john_doe")
                .build();

        System.out.println(user);
    }

}
