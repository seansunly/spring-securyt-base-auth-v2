package co.ruppcstat.ecomercv1.ecomV1.mapper;

import co.ruppcstat.ecomercv1.ecomV1.deman.Oder;
import co.ruppcstat.ecomercv1.ecomV1.feature.order.dtoOrder.OrderCreate;
import co.ruppcstat.ecomercv1.ecomV1.feature.order.dtoOrder.OrderResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OderMapper {
    Oder createOder(OrderCreate orderCreate);
    OrderResponse entityToResponse(Oder oder);
    List<OrderResponse> entityToResponseList(List<Oder> oderList);
}
