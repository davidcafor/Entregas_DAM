package com.david.hibernate.proyectohibernate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
    
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyectohibernate");  
		EntityManager em = emf.createEntityManager();
	  
	  int opcion;
	  
	  do {
		  opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Alta Empleado\n2. Baja Empleado\n3. Modificacion Empleado\n4. Alta Proyecto"
		  		+ "\n5. Baja Proyecto\n6. Modificacion Proyecto\n7. Alta AsigProyecto\n8. Baja AsigProyecto\n9. Modificacion AsigProyecto"
		  		+ "\n10. Datos empleado\n11. Datos proyecto\n12. Datos empleados asignados a un proyecto\n13. Datos empleados con salario superior a la media\n0. Salir"));
		  
		  switch (opcion) {
		  	
		  	case 1 -> {  		
		  			  		
		  		//ALTA EMPLEADO
		  		
		  		try {
		  			Empleado empleado = new Empleado();
					String nif = JOptionPane.showInputDialog("Indica el DNI del empleado");
					empleado.setDniNif(nif);
					String nombre = JOptionPane.showInputDialog("Indica el nombre del empleado");
					empleado.setNombre(nombre);
					double salario_bruto_anual = Double.parseDouble(JOptionPane.showInputDialog("Indica el salario anual del empleado"));
					empleado.setSueldoBrutoAnual(new BigDecimal(salario_bruto_anual));
					
					em.getTransaction().begin();
					em.persist(empleado);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error añadiendo empleado");
				}
					
			}
				

		  	case 2 -> {
		  		
		  		//BAJA EMPLEADO
		  		
		  		try {
		  			String dniEmpleado = JOptionPane.showInputDialog("Indica el DNI del empleado a eliminar.");
					em.getTransaction().begin();
					Empleado empleado = em.find(Empleado.class, dniEmpleado);
					em.remove(empleado);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error eliminando empleado");
				}
		  		
		  	}
		  	
		  	case 3 -> {
		  		
		  		//MODIFICACION EMPLEADO
		  		
		  		try {
					String dniEmpleado, nombreNuevo;
					float salarioNuevo;

					dniEmpleado = JOptionPane.showInputDialog("Indica el DNI del empleado a modificar");

					Empleado nuevo = em.find(Empleado.class, dniEmpleado);

					if (nuevo != null) {
						nombreNuevo = JOptionPane.showInputDialog("Dime el nombre nuevo");
						nuevo.setNombre(nombreNuevo);

						salarioNuevo = Float.parseFloat(JOptionPane.showInputDialog("Dime el salario nuevo"));
						nuevo.setSueldoBrutoAnual(new BigDecimal(salarioNuevo));

						em.getTransaction().begin();
						em.merge(nuevo);
						em.getTransaction().commit();
					} else {
						JOptionPane.showMessageDialog(null, "El DNI no existe");
					}

				} catch (NumberFormatException nfs) {
					JOptionPane.showMessageDialog(null, "Introduce un numero válido");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error modificando empleado");
				}
		  		
		  	}
		  	
		  	case 4 -> {
		  		
		  		//ALTA PROYECTO
		  		
		  		try {
		  			Proyecto proyecto = new Proyecto();
					String nombre = JOptionPane.showInputDialog("Indica el nombre del proyecto");
					proyecto.setNombre(nombre);
					int startDay = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de comienzo del proyecto"));
					int startMonth = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de comienzo del proyecto"));
					Calendar calStart = Calendar.getInstance();
					calStart.set(Calendar.YEAR, 2023);
					calStart.set(Calendar.MONTH, startMonth - 1);
					calStart.set(Calendar.DAY_OF_MONTH, startDay);
					Date startDate = calStart.getTime();
					proyecto.setFInicio(startDate);
					int endDay = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de finalizacion del proyecto"));
					int endMonth = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de finalizacion del proyecto"));
					Calendar calEnd = Calendar.getInstance();
					calEnd.set(Calendar.YEAR, 2023);
					calEnd.set(Calendar.MONTH, endMonth - 1);
					calEnd.set(Calendar.DAY_OF_MONTH, endDay);
					Date endDate = calEnd.getTime();
					proyecto.setFFin(endDate);
					String dniJefe = JOptionPane.showInputDialog("Indica el DNI del Jefe de proyecto");
					proyecto.setEmpleado(em.find(Empleado.class, dniJefe));
					em.getTransaction().begin();
					em.persist(proyecto);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error añadiendo proyecto");
				}
		  		
		  	}
		  	
		  	case 5 -> {
		  		
		  		//BAJA PROYECTO
		  		
		  		try {
		  			int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Indica el id del proyecto a eliminar"));
					em.getTransaction().begin();
					Proyecto proyecto = em.find(Proyecto.class, idBuscar);
					em.remove(proyecto);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error eliminando el proyecto");
				}
		  		
		  	}
		  	
		  	case 6 -> {
		  		
		  		//MODIFICACION PROYECTO
		  		
		  		try {
					int idBuscar, mes, dia;
					String nombreNuevo, dniJefe;
					Calendar cal = Calendar.getInstance();

					idBuscar = Integer
							.parseInt(JOptionPane.showInputDialog("Indica el ID del proyecto a modificar"));

					Proyecto nuevo = em.find(Proyecto.class, idBuscar);

					if (nuevo != null) {
						nombreNuevo = JOptionPane.showInputDialog("Indica el nuevo nombre");
						nuevo.setNombre(nombreNuevo);

						mes = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de inicio"));
						dia = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de inicio"));

						cal.set(Calendar.YEAR, 2023);
						cal.set(Calendar.MONTH, mes - 1);
						cal.set(Calendar.DAY_OF_MONTH, dia);
						Date endDate = cal.getTime();
						nuevo.setFInicio(endDate);

						nuevo.setFFin(null);

						dniJefe = JOptionPane.showInputDialog("Indica el DNI del nuevo jefe.");
						Empleado jefe = em.find(Empleado.class, dniJefe);

						if (jefe != null) {
							nuevo.setEmpleado(jefe);
						} else {
							JOptionPane.showMessageDialog(null, "El jefe no existe.");
						}
						em.getTransaction().begin();
						em.merge(nuevo);
						em.getTransaction().commit();
					} else {
						JOptionPane.showMessageDialog(null, "El DNI no existe.");
					}

				} catch (NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Numero no valido");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error modificando el proyecto");
				}
		  	}
		  	
		  	case 7 -> {
		  		
		  		//ALTA ASIGPROYECTO
		  		
		  		try {
		  			AsigProyectoPK asigPK = new AsigProyectoPK();
					AsigProyecto asigProy = new AsigProyecto();
					int proyId = Integer.parseInt(JOptionPane.showInputDialog("Indica un id de proyecto"));
					asigPK.setIdProy(proyId);
					String dniJefe = JOptionPane.showInputDialog("Indica el dni del empleado");
					asigPK.setDniNifEmpleado(dniJefe);
					int startDay = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de inicio"));
					int startMonth = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de inicio"));
					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.YEAR, 2023);
					cal.set(Calendar.MONTH, startMonth - 1);
					cal.set(Calendar.DAY_OF_MONTH, startDay);
					Date startDate = cal.getTime();
					asigPK.setFInicio(startDate);
					asigProy.setId(asigPK);
					int endDay = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de fin"));
					int endMonth = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de fin"));
					Calendar calEnd = Calendar.getInstance();
					calEnd.set(Calendar.YEAR, 2023);
					calEnd.set(Calendar.MONTH, endMonth - 1);
					calEnd.set(Calendar.DAY_OF_MONTH, endDay);
					Date endDate = calEnd.getTime();
					asigProy.setFFin(endDate);
					em.getTransaction().begin();
					em.persist(asigProy);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error añadiendo proyecto asignado");
				}
		  		
		  	}
		  	
		  	case 8 -> {
		  		
		  		//BAJA ASIGPROYECTO
		  		
		  		try {
		  			int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Indica el id del proyecto a eliminar"));
					String dniBuscar = JOptionPane.showInputDialog("Indica el DNI del empleado a eliminar");
					em.getTransaction().begin();
					AsigProyectoPK pk = new AsigProyectoPK();

					
					pk.setIdProy(idBuscar);
					pk.setDniNifEmpleado(dniBuscar);

					Proyecto proyecto = em.find(Proyecto.class, idBuscar);
					pk.setFInicio(proyecto.getFInicio());

					AsigProyecto asig = em.find(AsigProyecto.class, pk);

					em.remove(asig);
					em.getTransaction().commit();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error eliminando proyecto asignado");
				}
		  		
		  	}
		  	
		  	case 9 -> {
		  		
		  		//MODIFICACION ASIGPROYECTO
		  		
		  		try {
					String dniBuscar;
					int idBuscar, mes, dia, anho;
					Calendar cal = Calendar.getInstance();

					dniBuscar = JOptionPane.showInputDialog("Indica el DNI del empleado a actualizar");

					AsigProyectoPK pk = new AsigProyectoPK();
					pk.setDniNifEmpleado(dniBuscar);

					idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Indica el ID del proyecto a modificar"));
					pk.setIdProy(idBuscar);

					anho = Integer.parseInt(JOptionPane.showInputDialog("Indica el anho de inicio"));
					mes = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de inicio"));
					dia = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de inicio"));

					cal.set(Calendar.YEAR, anho);
					cal.set(Calendar.MONTH, mes - 1);
					cal.set(Calendar.DAY_OF_MONTH, dia);
					Date inDate = cal.getTime();

					pk.setFInicio(inDate);

					anho = Integer.parseInt(JOptionPane.showInputDialog("Indica el anho de finalizacion"));
					mes = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes de finalizacion"));
					dia = Integer.parseInt(JOptionPane.showInputDialog("Indica el dia de finalizacion"));

					cal.set(Calendar.YEAR, anho);
					cal.set(Calendar.MONTH, mes - 1);
					cal.set(Calendar.DAY_OF_MONTH, dia);
					Date endDate = cal.getTime();

					AsigProyecto mod = new AsigProyecto();
					mod.setId(pk);
					mod.setEmpleado(em.find(Empleado.class, dniBuscar));
					mod.setFFin(endDate);

					em.getTransaction().begin();
					em.merge(mod);
					em.getTransaction().commit();

				} catch (NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Numero no valido");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error modificando proyecto asignado");
				}
		  		
		  	}
		  	
		  	case 10 -> {
		  		
		  		//DATOS EMPLEADO
		  		
		  		try {
					String dniBuscar = JOptionPane.showInputDialog("Indica el DNI del empleado a buscar");
					Empleado empleado = em.find(Empleado.class, dniBuscar);
					System.out.println(empleado.toStringPersonalizado());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error mostrando datos empleado");
				}
		  		
		  	}
		  	
		  	case 11 -> {
		  		
		  		//DATOS PROYECTO
		  		
		  		try {
					int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Indica el ID del proyecto a buscar"));
					Proyecto proyecto = em.find(Proyecto.class, idBuscar);
					System.out.println(proyecto.toStringPersonalizado());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error mostrando datos del proyecto");
				}
		  		
		  	}
		  	
		  	case 12 -> {
		  		
		  		//DATOS EMPLEADOS ASIGNADOS A UN PROYECTO
		  		
		  		try {
					String dniJefe = JOptionPane.showInputDialog("Indica el nif del jefe");
					System.out.println("**Lista empleados**\n");
					em.getTransaction().begin();
					List<Empleado> empleados = em.createQuery("SELECT new Empleado(e.dniNif, e.nombre, p) FROM Empleado e INNER JOIN e.proyectos p WHERE p.empleado.dniNif = :dniJefe").setParameter("dniJefe", dniJefe).getResultList();
					for (Empleado emp : empleados) {
					System.out.println(emp.toStringProyecto());
					}
					em.getTransaction().commit();
								
												
				}catch(Exception e) {
					System.out.println("Error listando datos proyecto asignado: " + e);
				}
		  		
		  	}
		  	
		  	case 13 -> {
		  		
		  		//DATOS EMPLEADOS CON SALARIO SUPERIOR A LA MEDIA
		  		
		  		try {
		  			em.getTransaction().begin();
					System.out.println("**Lista empleados con salario superior a la media**\n");
					List<Empleado> empleados = em.createQuery("FROM Empleado e WHERE e.sueldoBrutoAnual > (SELECT avg(emp.sueldoBrutoAnual) FROM Empleado emp)").getResultList();
					for (Empleado emp : empleados) {
					System.out.println(emp.toStringPersonalizado());
					}
					em.getTransaction().commit();
				} catch (Exception e) {
					System.out.println("Error listando empleados salario medio: " + e);
				}
		  	}
		  	
		  	

		  }
  
	  }while(opcion!=0);
	  
	  //Pechamos objetos emf e em
	  em.close();
	  emf.close();
	
	}
}
