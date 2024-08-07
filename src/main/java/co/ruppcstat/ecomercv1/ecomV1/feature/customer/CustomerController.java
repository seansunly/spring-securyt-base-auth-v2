package co.ruppcstat.ecomercv1.ecomV1.feature.customer;

import co.ruppcstat.ecomercv1.ecomV1.deman.Customer;
import co.ruppcstat.ecomercv1.ecomV1.feature.customer.DTOCustomer.CustomerCreate;
import co.ruppcstat.ecomercv1.ecomV1.feature.customer.DTOCustomer.CustomerResponse;
import co.ruppcstat.ecomercv1.ecomV1.feature.customer.DTOCustomer.CustomerUpdate;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping
    public CustomerResponse createCustomer(@Valid @RequestBody CustomerCreate customerCreate) {
        return customerService.createCustomer(customerCreate);
    }
    @GetMapping
    public List<CustomerResponse> getAllCustomers() {
        return customerService.getCustomers();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }
    @PatchMapping("/{phone}")
    public CustomerResponse updateCustomer(@PathVariable String phone, @RequestBody CustomerUpdate customerUpdate) {
        return customerService.updateCustomer(phone, customerUpdate);
    }
    @GetMapping("/{phone}")
    public CustomerResponse getCustomerByPhoneNumber(@PathVariable String phone) {
        return customerService.getByphone(phone);
    }
    @PatchMapping("/{phone}/remark")
    public void updateCustomerByPhoneNumber(@PathVariable String phone) {
         customerService.updateIsDeleted(phone);
    }

}
