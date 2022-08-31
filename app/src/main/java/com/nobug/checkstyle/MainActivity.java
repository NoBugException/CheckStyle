// Copyright (C) 2004 Luxshare
// All rights reserved

package com.nobug.checkstyle;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.*;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.nobug.checkstyle.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    // TODO 阿萨
    private AppBarConfiguration appBarConfiguration;

    private ActivityMainBinding binding;
    int[] numbers = {1, 2, 3,};
    public int aVoid;

    private static final String AA_a = "";

    private int intField1 = 0; // violation
    private int intField2 = 1;
    private int intField3;

    private char charField1 = '\0'; // violation
    private char charField2 = 'b';
    private char charField3;

    private boolean boolField1 = false; // violation
    private boolean boolField2 = true;
    private boolean boolField3;

    private int arrField1[] = null; // violation
    private int arrField2[] = new int[10];
    private int arrField3[];
    Map<Integer, String> m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(view -> {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });
    }

    public void bb(int a, int b) {

    }

    /**
     * This comment looks like javadoc but it at an invalid location.
     * Therefore, the text will not get into TestClass.html and the check will produce a violation.
     */
    @SuppressWarnings("serial")
    public void aa(int a, int b) {
        int i = 0;
        switch (i) {
            case 1:
                i++; // fall through
                break;

        }
    }

    //    /**
    //     * Actual exception thrown is child class of class that is declared in throws.
    //     * It is limitation of checkstyle (as checkstyle does not know type hierarchy).
    //     * Javadoc is valid not declaring FileNotFoundException
    //     * BUT checkstyle can not distinguish relationship between exceptions.
    //     * @param file some file
    //     * @throws IOException if some problem
    //     */
    public void doSomething8 (File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException(); // violation
        }
    }

    /**
     * Exact throw type referencing in javadoc even first is parent of second type.
     * It is a limitation of checkstyle (as checkstyle does not know type hierarchy).
     * This javadoc is valid for checkstyle and for javadoc tool.
     * @param file some file
     * @throws IOException if some problem
     * @throws FileNotFoundException if file is not found
     */
    public void doSomething9(File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException();
        }
    }

    /**
     * Ignore try block, but keep catch and finally blocks.
     *
     * @param s String to parse
     * @return A positive integer
     */
    public int parsePositiveInt(String s) {
        try {
            int value = Integer.parseInt(s);
            if (value <= 0) {
                throw new NumberFormatException(value + " is negative/zero"); // ok, try
            }
            return value;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid number", ex); // violation, catch
        } finally {
            throw new IllegalStateException("Should never reach here"); // violation, finally
        }
    }

    public String readLine() {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) {
                throw new IllegalStateException("Empty input"); // violation, not caught
            }
            return sc.next();
        }
    }

    /**
     * Lambda expressions are ignored as we do not know when the exception will be thrown.
     *
     * @param s a String to be printed at some point in the future
     * @return a Runnable to be executed when the string is to be printed
     */
    public Runnable printLater(String s) {
        return () -> {
            if (s == null) {
                throw new NullPointerException(); // ok
            }
            System.out.println(s);
        };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
