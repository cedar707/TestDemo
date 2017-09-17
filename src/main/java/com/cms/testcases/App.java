package com.cms.testcases;

import org.ho.yaml.Yaml;
import org.junit.Test;

import com.cms.util.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	//д��yaml�����ļ�
    @Test
    public  void write() {
        /* Initialize data. */
        Person father = new Person();
        father.setName("simon.zhang");
        father.setAge(23);
        father.setSex("man");
        List<Person> children=new ArrayList<Person>();
        for (int i = 8; i < 10; i++) {
            Person child = new Person();
            if (i % 2 == 0) {
                child.setSex("man");
                child.setName("mary" + (i - 7));
            } else {
                child.setSex("fatel");
                child.setName("simon" + (i - 7));
            }
            child.setAge(i);
            children.add(child);
        }
        father.setChildren(children);
        /* Export data to a YAML file. */
        File dumpFile = new File(System.getProperty("user.dir") + "/Locator/Persion.yaml");

        try {
            Yaml.dump(father, dumpFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //��ȡyaml�����ļ�
    @Test
    public  void  read() throws FileNotFoundException {
        File dumpFile=new File(System.getProperty("user.dir") + "/Locator/Persion.yaml");
        Person father = (Person) Yaml.loadType(dumpFile, Person.class);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(father.getName())
                .append("\t")
                .append(father.getSex())
                .append("\t")
                .append(father.getAge())
                .append("\t")
                .append(father.getChildren().size());
//        System.out.println(stringBuilder.toString());

    }

    //��ȡyaml�����ļ�Map�ṹ
    @Test
    public  void  read2() throws FileNotFoundException {
        File dumpFile=new File(System.getProperty("user.dir") + "/Locator/config.yaml");
        Map father =Yaml.loadType(dumpFile, HashMap.class);
        for(Object key:father.keySet()){
            System.out.println(key+":\t"+father.get(key).toString());
        }
    }
}
