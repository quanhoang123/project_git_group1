/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author quan.hoang22
 */
public class Cat extends Animal implement Sound{
	Cat(){
    super(String name, float canNang, float chieuCao)
	}
	public void Sound(){
	System.out.println("Meo meo");
	}
	
}
