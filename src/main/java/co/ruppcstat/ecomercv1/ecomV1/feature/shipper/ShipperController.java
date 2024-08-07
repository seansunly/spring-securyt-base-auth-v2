package co.ruppcstat.ecomercv1.ecomV1.feature.shipper;

import co.ruppcstat.ecomercv1.ecomV1.deman.Shipper;
import co.ruppcstat.ecomercv1.ecomV1.feature.shipper.dtoShipper.ShipperCreate;
import co.ruppcstat.ecomercv1.ecomV1.feature.shipper.dtoShipper.ShipperResponse;
import co.ruppcstat.ecomercv1.ecomV1.feature.shipper.dtoShipper.ShipperUpdate;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shippers")
@RequiredArgsConstructor
public class ShipperController {
    private final ShipperService shipperService;
    @GetMapping
    public List<ShipperResponse> getShippers() {
        return shipperService.getShippers();
    }
    @PostMapping
    public ShipperResponse createShipper(@Valid @RequestBody ShipperCreate shipperCreate){
        return shipperService.createShipper(shipperCreate);
    }
    @DeleteMapping("/{contactPhone}")
    public void deleteShipper(@PathVariable String contactPhone){
        shipperService.deleteShipper(contactPhone);
    }
    @GetMapping("/{contactPhone}")
    public ShipperResponse getShipper(@PathVariable String contactPhone){
        return shipperService.getShipper(contactPhone);
    }
    @PatchMapping("/{contactPhone}")
    public ShipperResponse updateShipper(@PathVariable String contactPhone, @Valid @RequestBody ShipperUpdate update){
        return shipperService.updateShipper(contactPhone, update);
    }
    @PatchMapping("/{contactPhone}/shipperIsDeleted")
    public ShipperResponse isDeletedShipper(@PathVariable String contactPhone){
        return shipperService.isDeletedShipper(contactPhone);
    }

}
