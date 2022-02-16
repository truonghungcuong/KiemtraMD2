package com.codegym.controller.phonebook;

import com.codegym.controller.ReadFile;
import com.codegym.controller.WriteFile;
import com.codegym.model.Personinfo;

public interface IPhoneBookManagement extends ReadFile, WriteFile {
    void displayAll();

    void addNew(Personinfo personinfo);

    void update(int index, Personinfo personinfo);

    void delete(int index);

}
