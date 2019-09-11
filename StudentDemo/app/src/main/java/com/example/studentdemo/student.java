package com.example.studentdemo;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class student extends AppCompatActivity{
    public void getname(Context applicationContext)
    {
        System.out.println("student class is created");
    }


    public void test(Context applicationContext) {
        Toast.makeText(applicationContext, "registered is created", Toast.LENGTH_SHORT).show();
    }

    public void getbranch(Context applicationContext) {
        Toast.makeText(applicationContext, "Course is created", Toast.LENGTH_SHORT).show();
    }
}

//    public void test() {
//        System.out.println("test class is created");
//    }
//
//    public void getbranch() {
//        System.out.println("course class is created");
//    }
//}

//public class student {
//    String name;
//    String ID;
////    String gender;
//}
//    public void getname(String name,String ID)
//
//        {
//            System.out.println("student is created");
//        }







/*
Toast.makeText(applicationContext, "student is created", Toast.LENGTH_SHORT).show();
}




public void getBranch(Context applicationContext) {


}



public void test(Context applicationContext) {
Toast.makeText(applicationContext, "registered is created", Toast.LENGTH_SHORT).show();
}

public void getbranch(Context applicationContext) {
Toast.makeText(applicationContext, "Course is created", Toast.LENGTH_SHORT).show();
}
}
*/
