package com.mkpits.collection;

import java.util.ArrayList;

public class StudentClassCall {

public static void main(String[] args) {
ArrayList<ModalClassStd> l1 = new ArrayList<ModalClassStd>();
l1.add(new ModalClassStd(101, "harsh"));
l1.add(new ModalClassStd(102, "rahul"));
l1.add(new ModalClassStd(103, "pranav"));


ArrayList<ModalClassStd> l2 = new ArrayList<ModalClassStd>();
l2.add(new ModalClassStd(101, "harsh"));
l2.add(new ModalClassStd(104, "aditya"));
l2.add(new ModalClassStd(105, "kunal"));



l1.addAll(l2);
for (ModalClassStd modalClassStd : l1) 
{
	System.out.println(modalClassStd);
	
}
System.out.println();

l1.removeAll(l2);
for (ModalClassStd modalClassStd : l1) {
	
	System.out.println(modalClassStd);
}




	}

}
