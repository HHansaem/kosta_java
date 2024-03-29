package com.test04;

public class PlaneTest {
	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체생성
		Airplane air = new Airplane("L777", 1000);
		Cargoplane cargo = new Cargoplane("C50", 1000);
		
		// 생성된 객체의 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		System.out.println(air.getPlaneName() + " " + air.getFueSize());
		System.out.println(cargo.getPlaneName() + " " + cargo.getFueSize());

		// Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항\n");
		air.flight(100);
		cargo.flight(100);
		
		// 운항후 객체의 변경된 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		System.out.println(air.getPlaneName() + " " + air.getFueSize());
		System.out.println(cargo.getPlaneName() + " " + cargo.getFueSize());
		
		// Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유\n");
		air.refuel(200);
		cargo.refuel(200);
		
		// 주유후 객체의 변경된 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		System.out.println(air.getPlaneName() + " " + air.getFueSize());
		System.out.println(cargo.getPlaneName() + " " + cargo.getFueSize());
		
	}
}
