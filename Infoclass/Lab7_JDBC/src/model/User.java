/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import javax.swing.ImageIcon;

/**
 *
 * @author ProBook
 */
public class User {
    //data members
    private int userId;
    private String name;
    private String lastname;
    private String gender = "";
    private int age;
    private String phonenumber;
    private String email = "";
    private String hobbies;
    private ImageIcon imagePicture;
    //method 

    public int getUserId() {
        return userId;
    } 

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public ImageIcon getImagePicture() {
        return imagePicture;
    }

    public void setImagePicture(ImageIcon imagePicture) {
        this.imagePicture = imagePicture;
    }

    @Override
    public String toString() {
        return "First Name: " + name + "\n" +
            "Last Name: " + lastname + "\n" +
            "Gender: " + gender + "\n" +
            "Age: " + age + "\n" +
            "Phone Number: " + phonenumber + "\n" +
            "Email: " + email + "\n" +
            "Hobbies: " + hobbies;
    }
    
}
