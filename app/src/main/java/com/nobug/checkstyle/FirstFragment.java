package com.nobug.checkstyle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.*;
import androidx.navigation.fragment.NavHostFragment;

import com.nobug.checkstyle.databinding.FragmentFirstBinding;

import java.io.*;


public class FirstFragment extends Fragment {

    public int a = 1;

    private FragmentFirstBinding binding;

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    protected void finalize() throws Throwable {
        int a = 0;
        try {
            if (true) {
                throw new RuntimeException("");
            }
        } catch (Exception e) {
            throw new RuntimeException("");
        }

        super.finalize();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    /**
     * Actual exception thrown is child class of class that is declared in throws.
     * It is limitation of checkstyle (as checkstyle does not know type hierarchy).
     * Javadoc is valid not declaring FileNotFoundException
     * BUT checkstyle can not distinguish relationship between exceptions.
     *
     * @param file
     * @throws FileNotFoundException if some problem
     * @throws IOException           if some problem
     */
    public void doSomething8(File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException(); // violation
        }
    }

    /**
     * Exact throw type referencing in javadoc even first is parent of second type.
     * It is a limitation of checkstyle (as checkstyle does not know type hierarchy).
     * This javadoc is valid for checkstyle and for javadoc tool.
     *
     * @param file some file
     * @throws IOException           if some problem
     * @throws FileNotFoundException if file is not found
     */
    public void doSomething9(File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException();
        }
    }

    /**
     * @param s
     * @return AS
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

    public Runnable printLater(String s) {
        return () -> {
            if (s == null) {
                throw new NullPointerException(); // ok
            }
            System.out.println(s);
        };
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
