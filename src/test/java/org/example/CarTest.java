package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.MockitoJUnitRunner;

import org.mockito.Mockito;

//@ExtendWith(MockitoExtension.class)
//public class CarTest {
//
//    @Mock
//    private Vehicle mockedVehicle;
//
//    @InjectMocks
//    private Car car;
//
//    @BeforeEach
//    public void setUp() {
//        car = new Car();
//        car.setFourWheelDrive(true);
//        car.setMake("Toyota");
//        car.setModel("Camry");
//    }
//
//    @Test
//    public void testCalculateBill() {
//        assertEquals(200, car.calculateBill());
//    }
//
//    @Test
//    public void testCalculateTotalCost() {
//
//        when(mockedVehicle.calculateInsurance()).thenReturn(150);
//
//        assertEquals(350, car.calculateBill() + mockedVehicle.calculateInsurance());
//
//        verify(mockedVehicle, times(1)).calculateInsurance();
//    }
//}

