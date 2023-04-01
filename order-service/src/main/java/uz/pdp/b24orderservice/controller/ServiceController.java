//package uz.pdp.b24orderservice.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import uz.pdp.b24orderservice.controller.dto.OrderRequest;
//import uz.pdp.b24orderservice.controller.dto.OrderResponse;
//import uz.pdp.b24orderservice.entity.OrderEntity;
//import uz.pdp.b24orderservice.service.OrderService;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/order")
//public class ServiceController {
//    private final OrderService orderService;
//
//    @PostMapping()
//    @ResponseStatus(HttpStatus.CREATED)
//    public OrderResponse create(
//            @Valid @RequestBody OrderRequest orderRequest
//    ) {
//        return orderService.createOrder(orderRequest);
//    }
//
//    @GetMapping("/{orderId}")
//    public OrderResponse getSingleOrder(
//            @PathVariable int orderId
//    ) {
//        orderService.get
//    }
//
//    @GetMapping()
//    public List<OrderResponse> getOrderList(
//            @RequestParam(name = "username") String username
//    ) {
//        return orderService.getOrderList(username).stream().map(OrderResponse::from).toList();
//    }
//}
