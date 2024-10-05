package com.ardev.graphql.Enums;

public enum Status {
    /** Order has been cancelled */
    ORDER_CANCELLED,
    /** Order has been delivered */
    ORDER_DELIVERED,
    /** Order is in transit */
    ORDER_IN_TRANSIT,
    /** Payment for the order is due */
    ORDER_PAYMENT_DUE,
    /** Order is available for pickup */
    ORDER_PICKUP_AVAILABLE,
    /** There is a problem with the order */
    ORDER_PROBLEM,
    /** Order is being processed */
    ORDER_PROCESSING,
    /** Order has been returned */
    ORDER_RETURNED
}
