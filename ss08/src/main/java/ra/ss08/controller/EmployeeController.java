package ra.ss08.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ra.ss08.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeController() {
        employeeList.add(new Employee("Hà Huyền Trang", "a@gmail.com", "IT"));
        employeeList.add(new Employee("Chang Chang", "b@gmail.com", "ITn"));
    }

    // Hiển thị danh sách
    @GetMapping("/employees")
    public ModelAndView showEmployeeList(@RequestParam(value = "message", required = false) String message) {
        ModelAndView mav = new ModelAndView("listEmployee");
        mav.addObject("employees", employeeList);
        if (message != null) {
            mav.addObject("message", message);
        }
        return mav;
    }

    // Hiển thị form thêm
    @GetMapping("/employees/add")
    public ModelAndView showAddForm() {
        ModelAndView mav = new ModelAndView("addEmployee");
        mav.addObject("employee", new Employee());
        return mav;
    }

    // Xử lý thêm mới
    @PostMapping("/employees")
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
        employeeList.add(employee);
        ModelAndView mav = new ModelAndView("listEmployee");
        mav.addObject("employees", employeeList);
        mav.addObject("message", "Thêm thành công");
        return mav;
    }
}