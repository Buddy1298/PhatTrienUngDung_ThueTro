package com.coding.manageapp;

import java.awt.Font;

import com.hoangduy.developeui.*;
import com.coding.manageapp.database.*;
import com.coding.manageapp.giaodien.*;

public class Main {
	 public static void main(String args[]) {
		 Database.getInstance().connect();
		 AppForm appForm = new AppForm();

	 }
}
