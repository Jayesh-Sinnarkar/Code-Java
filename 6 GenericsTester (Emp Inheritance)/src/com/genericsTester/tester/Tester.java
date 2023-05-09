package com.genericsTester.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.genericsTester.implementations.GenericUtils;

import inheritance.Emp;
import inheritance.Mgr;
import inheritance.SalesMgr;
import inheritance.TempWorker;

public class Tester {
	public static void main(String[] args) {
//		Tester class  : ArrayList<SalesMgr>, LinkedList<TempWorker> ,Vector<Mgr>
		ArrayList<SalesMgr> smlist = new ArrayList<>();
		smlist.add(new SalesMgr());
		smlist.add(new SalesMgr());
		smlist.add(new SalesMgr());
		smlist.add(new SalesMgr());
		smlist.add(new SalesMgr());
		System.out.println("Sum of SalesManager List = " + GenericUtils.sumOfSalary(smlist));

		LinkedList<TempWorker> tempWList = new LinkedList<>();
		tempWList.add(new TempWorker());
		tempWList.add(new TempWorker());
		tempWList.add(new TempWorker());
		tempWList.add(new TempWorker());
		tempWList.add(new TempWorker());
		System.out.println("Sum of TempWorker List = " + GenericUtils.sumOfSalary(tempWList));

		Vector<Mgr> mgrList = new Vector<>();
		mgrList.add(new Mgr());
		mgrList.add(new SalesMgr());
		System.out.println("Sum of Manager List (1 Manager, 1 SalesManager) = " + GenericUtils.sumOfSalary(mgrList));

//		You should get a compiler err : if you pass
//		ArrayList<Integer> , LinkedList<Double> ,Vector<String>

//		 GenericUtils.sumOfSalary(new ArrayList<Integer>());
//		 GenericUtils.sumOfSalary(new LinkedList<Double>());
//		 GenericUtils.sumOfSalary(new Vector<String>());
	}
}
