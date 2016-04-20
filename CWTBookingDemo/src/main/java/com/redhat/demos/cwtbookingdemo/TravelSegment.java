package com.redhat.demos.cwtbookingdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TravelSegment implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Travel Segement ID")
   private java.lang.String segmentID;
   @org.kie.api.definition.type.Label("Segment Origination Date/Time ")
   private java.util.Date originationDate;
   @org.kie.api.definition.type.Label("Travel Segment Termination Date")
   private java.util.Date terminationDate;
   @org.kie.api.definition.type.Label("Airline, Hotel, Car Segment Code")
   private java.lang.String segmentTypeCode;
   @org.kie.api.definition.type.Label("Airline, Hotel, Car Vendor")
   private java.lang.String segmentVendorCode;

   @org.kie.api.definition.type.Label("Originating Destination")
   private java.lang.String originationDestinationCode;

   @org.kie.api.definition.type.Label("Terminating Destination")
   private java.lang.String terminatingDestinationCode;

   @org.kie.api.definition.type.Label("Fare/Pricing Classification")
   private java.lang.String segmentFareClass;

   @org.kie.api.definition.type.Label("Payment Type")
   private java.lang.String segmentPaymentType;

   @org.kie.api.definition.type.Label("Passenger Segment Remarks")
   private java.util.List<java.lang.String> segmentRemarks;

   @org.kie.api.definition.type.Label("BookingComment")
   private java.lang.String segmentComment;

   @org.kie.api.definition.type.Label("Reason for Trip")
   private java.lang.String tripReason;

   @org.kie.api.definition.type.Label("Date Booked")
   private java.util.Date bookingDate;

   @org.kie.api.definition.type.Label("Flight Number")
   private java.lang.String flgihtID;

   @org.kie.api.definition.type.Label("Price Limite")
   private String pricelimit;

   public TravelSegment()
   {
   }

   public java.lang.String getSegmentID()
   {
      return this.segmentID;
   }

   public void setSegmentID(java.lang.String segmentID)
   {
      this.segmentID = segmentID;
   }

   public java.util.Date getOriginationDate()
   {
      return this.originationDate;
   }

   public void setOriginationDate(java.util.Date originationDate)
   {
      this.originationDate = originationDate;
   }

   public java.util.Date getTerminationDate()
   {
      return this.terminationDate;
   }

   public void setTerminationDate(java.util.Date terminationDate)
   {
      this.terminationDate = terminationDate;
   }

   public java.lang.String getSegmentTypeCode()
   {
      return this.segmentTypeCode;
   }

   public void setSegmentTypeCode(java.lang.String segmentTypeCode)
   {
      this.segmentTypeCode = segmentTypeCode;
   }

   public java.lang.String getSegmentVendorCode()
   {
      return this.segmentVendorCode;
   }

   public void setSegmentVendorCode(java.lang.String segmentVendorCode)
   {
      this.segmentVendorCode = segmentVendorCode;
   }

   public java.lang.String getOriginationDestinationCode()
   {
      return this.originationDestinationCode;
   }

   public void setOriginationDestinationCode(
         java.lang.String originationDestinationCode)
   {
      this.originationDestinationCode = originationDestinationCode;
   }

   public java.lang.String getTerminatingDestinationCode()
   {
      return this.terminatingDestinationCode;
   }

   public void setTerminatingDestinationCode(
         java.lang.String terminatingDestinationCode)
   {
      this.terminatingDestinationCode = terminatingDestinationCode;
   }

   public java.lang.String getSegmentFareClass()
   {
      return this.segmentFareClass;
   }

   public void setSegmentFareClass(java.lang.String segmentFareClass)
   {
      this.segmentFareClass = segmentFareClass;
   }

   public java.lang.String getSegmentPaymentType()
   {
      return this.segmentPaymentType;
   }

   public void setSegmentPaymentType(java.lang.String segmentPaymentType)
   {
      this.segmentPaymentType = segmentPaymentType;
   }

   public java.util.List<java.lang.String> getSegmentRemarks()
   {
      return this.segmentRemarks;
   }

   public void setSegmentRemarks(java.util.List<java.lang.String> segmentRemarks)
   {
      this.segmentRemarks = segmentRemarks;
   }

   public java.lang.String getSegmentComment()
   {
      return this.segmentComment;
   }

   public void setSegmentComment(java.lang.String segmentComment)
   {
      this.segmentComment = segmentComment;
   }

   public java.lang.String getTripReason()
   {
      return this.tripReason;
   }

   public void setTripReason(java.lang.String tripReason)
   {
      this.tripReason = tripReason;
   }

   @Override
   public String toString()
   {
      return "TravelSegment is" + segmentComment + "...next..." + segmentFareClass + "...next..." + segmentPaymentType;
   }

   public java.util.Date getBookingDate()
   {
      return this.bookingDate;
   }

   public void setBookingDate(java.util.Date bookingDate)
   {
      this.bookingDate = bookingDate;
   }

   public java.lang.String getFlgihtID()
   {
      return this.flgihtID;
   }

   public void setFlgihtID(java.lang.String flgihtID)
   {
      this.flgihtID = flgihtID;
   }

   public java.lang.String getPricelimit()
   {
      return this.pricelimit;
   }

   public void setPricelimit(java.lang.String pricelimit)
   {
      this.pricelimit = pricelimit;
   }

   public TravelSegment(java.lang.String segmentID,
         java.util.Date originationDate, java.util.Date terminationDate,
         java.lang.String segmentTypeCode, java.lang.String segmentVendorCode,
         java.lang.String originationDestinationCode,
         java.lang.String terminatingDestinationCode,
         java.lang.String segmentFareClass, java.lang.String segmentPaymentType,
         java.util.List<java.lang.String> segmentRemarks,
         java.lang.String segmentComment, java.lang.String tripReason,
         java.util.Date bookingDate, java.lang.String flgihtID,
         java.lang.String pricelimit)
   {
      this.segmentID = segmentID;
      this.originationDate = originationDate;
      this.terminationDate = terminationDate;
      this.segmentTypeCode = segmentTypeCode;
      this.segmentVendorCode = segmentVendorCode;
      this.originationDestinationCode = originationDestinationCode;
      this.terminatingDestinationCode = terminatingDestinationCode;
      this.segmentFareClass = segmentFareClass;
      this.segmentPaymentType = segmentPaymentType;
      this.segmentRemarks = segmentRemarks;
      this.segmentComment = segmentComment;
      this.tripReason = tripReason;
      this.bookingDate = bookingDate;
      this.flgihtID = flgihtID;
      this.pricelimit = pricelimit;
   }

}