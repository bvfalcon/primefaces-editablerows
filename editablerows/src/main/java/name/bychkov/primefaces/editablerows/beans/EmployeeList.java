package name.bychkov.primefaces.editablerows.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.primefaces.event.RowEditEvent;

import name.bychkov.primefaces.editablerows.entities.Employee;

@ManagedBean
@ViewScoped
public class EmployeeList implements Serializable {
	private static final long serialVersionUID = 5370526419467960501L;

	// predefined data - database simulation
	private static Set<Employee> employee = new HashSet<Employee>();
	static {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Mark");
		emp1.setSurname("Twain");
		emp1.setAddress("Vereinigten Staaten, Connecticut, Redding");
		emp1.setEmail("twain@example.com");
		employee.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Hermann");
		emp2.setSurname("Hesse");
		emp2.setAddress("Schweiz, Montagnola");
		emp2.setEmail("hesse@example.com");
		employee.add(emp2);

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Lew");
		emp3.setSurname("Tolstoi");
		emp3.setAddress("Russland, Tula");
		emp3.setEmail("twain@example.com");
		employee.add(emp3);
	}

	public List<Employee> getPersons() {
		return new ArrayList<Employee>(employee);
	}

	public void save(RowEditEvent<Employee> event) {
		Employee edited = event.getObject();
		employee.add(edited);
	}
}