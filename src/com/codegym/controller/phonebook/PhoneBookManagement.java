package com.codegym.controller.phonebook;

import com.codegym.model.Personinfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookManagement implements IPhoneBookManagement {
    private List<Personinfo> personinfos = new ArrayList<>();

    public int size() {
        return personinfos.size();
    }

    public int findPersoninfoByPhonenumber(String phonenumber) {
        int index = -1;
        for (int i = 0; i < personinfos.size(); i++) {
            if (personinfos.get(i).getPhonenumber().equals(phonenumber)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public Personinfo getByIndex(int index){
        return personinfos.get(index);
    }
    public int findByName(String name){
        int index=-1;
        for (int i = 0; i <personinfos.size() ; i++) {
            if (personinfos.get(i).getName().equals(name)){
                index=i;
            }
        }
        return index;
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.personinfos = (List<Personinfo>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.personinfos);
    }

    @Override
    public void displayAll() {
        for (Personinfo personinfo : personinfos) {
            System.out.println(personinfo);
        }
    }


    @Override
    public void addNew (Personinfo personinfo) {
        this.personinfos.add(personinfo);
    }


    @Override
    public void update(int index, Personinfo personinfo) {
        this.personinfos.set(index, personinfo);
    }

    @Override
    public void delete(int index) {
        this.personinfos.remove(index);
    }
}
