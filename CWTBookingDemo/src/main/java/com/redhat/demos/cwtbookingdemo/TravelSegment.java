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

   @org.kie.api.definition.type.Label("Client Sub to IRD")
   private java.lang.String clientSubtoIRD;

   @org.kie.api.definition.type.Label("Undergone IRD")
   private java.lang.String undergoneird;

   @org.kie.api.definition.type.Label("Client GUID")
   private java.lang.String clientGUID;

   @org.kie.api.definition.type.Label("Country")
   private java.lang.String country;

   @org.kie.api.definition.type.Label("Booking PCC")
   private java.lang.String bookingPCC;

   @org.kie.api.definition.type.Label("Number of Air Segments")
   private java.lang.String numberofairsegments;

   @org.kie.api.definition.type.Label("Total Airfare")
   private java.lang.String totalairfare;

   @org.kie.api.definition.type.Label("Preticketing Days")
   private java.lang.String preticketingdays;

   @org.kie.api.definition.type.Label("With Air Segment")
   private java.lang.String withairsegment;

   @org.kie.api.definition.type.Label("Channel")
   private java.lang.String channel;

   @org.kie.api.definition.type.Label("Process Master")
   private java.lang.String processmaster;

   @org.kie.api.definition.type.Label("Fee")
   private java.lang.String fee;

   @org.kie.api.definition.type.Label("Card")
   private java.lang.String card;

   @org.kie.api.definition.type.Label("Air Segment")
   private java.lang.String airsegment;

   @org.kie.api.definition.type.Label("Car Segment")
   private java.lang.String carsegment;

   @org.kie.api.definition.type.Label("Fee Source")
   private java.lang.String feesource;

   @org.kie.api.definition.type.Label(value = "Preticket days Input")
   private java.lang.String daysinadvance;

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
      return "TravelSegment is" +
            clientSubtoIRD + ".." + undergoneird + "..." + withairsegment + ".." + clientGUID + "..." + country + "..." + bookingPCC + "..." + numberofairsegments + "..." + totalairfare
            + "..." + preticketingdays + "..." + "channel is: " + channel + "processmaster is: " + processmaster + "fee is: " + fee + "card is: " + card + "airsegment is:" + airsegment
            + "carsegment is: " + carsegment + "feesource is: " + feesource;
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

   public java.lang.String getClientSubtoIRD()
   {
      return this.clientSubtoIRD;
   }

   public void setClientSubtoIRD(java.lang.String clientSubtoIRD)
   {
      this.clientSubtoIRD = clientSubtoIRD;
   }

   public java.lang.String getUndergoneird()
   {
      return this.undergoneird;
   }

   public void setUndergoneird(java.lang.String undergoneird)
   {
      this.undergoneird = undergoneird;
   }

   public java.lang.String getClientGUID()
   {
      return this.clientGUID;
   }

   public void setClientGUID(java.lang.String clientGUID)
   {
      this.clientGUID = clientGUID;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public java.lang.String getBookingPCC()
   {
      return this.bookingPCC;
   }

   public void setBookingPCC(java.lang.String bookingPCC)
   {
      this.bookingPCC = bookingPCC;
   }

   public java.lang.String getNumberofairsegments()
   {
      return this.numberofairsegments;
   }

   public void setNumberofairsegments(java.lang.String numberofairsegments)
   {
      this.numberofairsegments = numberofairsegments;
   }

   public java.lang.String getTotalairfare()
   {
      return this.totalairfare;
   }

   public void setTotalairfare(java.lang.String totalairfare)
   {
      this.totalairfare = totalairfare;
   }

   public java.lang.String getPreticketingdays()
   {
      return this.preticketingdays;
   }

   public void setPreticketingdays(java.lang.String preticketingdays)
   {
      this.preticketingdays = preticketingdays;
   }

   public java.lang.String getWithairsegment()
   {
      return this.withairsegment;
   }

   public void setWithairsegment(java.lang.String withairsegment)
   {
      this.withairsegment = withairsegment;
   }

   public java.lang.String getChannel()
   {
      return this.channel;
   }

   public void setChannel(java.lang.String channel)
   {
      this.channel = channel;
   }

   public java.lang.String getProcessmaster()
   {
      return this.processmaster;
   }

   public void setProcessmaster(java.lang.String processmaster)
   {
      this.processmaster = processmaster;
   }

   public java.lang.String getFee()
   {
      return this.fee;
   }

   public void setFee(java.lang.String fee)
   {
      this.fee = fee;
   }

   public java.lang.String getCard()
   {
      return this.card;
   }

   public void setCard(java.lang.String card)
   {
      this.card = card;
   }

   public java.lang.String getAirsegment()
   {
      return this.airsegment;
   }

   public void setAirsegment(java.lang.String airsegment)
   {
      this.airsegment = airsegment;
   }

   public java.lang.String getCarsegment()
   {
      return this.carsegment;
   }

   public void setCarsegment(java.lang.String carsegment)
   {
      this.carsegment = carsegment;
   }

   public java.lang.String getFeesource()
   {
      return this.feesource;
   }

   public void setFeesource(java.lang.String feesource)
   {
      this.feesource = feesource;
   }

   public java.lang.String getDaysinadvance()
   {
      return this.daysinadvance;
   }

   public void setDaysinadvance(java.lang.String daysinadvance)
   {
      this.daysinadvance = daysinadvance;
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
         java.lang.String pricelimit, java.lang.String clientSubtoIRD,
         java.lang.String undergoneird, java.lang.String clientGUID,
         java.lang.String country, java.lang.String bookingPCC,
         java.lang.String numberofairsegments, java.lang.String totalairfare,
         java.lang.String preticketingdays, java.lang.String withairsegment,
         java.lang.String channel, java.lang.String processmaster,
         java.lang.String fee, java.lang.String card,
         java.lang.String airsegment, java.lang.String carsegment,
         java.lang.String feesource, java.lang.String daysinadvance)
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
      this.clientSubtoIRD = clientSubtoIRD;
      this.undergoneird = undergoneird;
      this.clientGUID = clientGUID;
      this.country = country;
      this.bookingPCC = bookingPCC;
      this.numberofairsegments = numberofairsegments;
      this.totalairfare = totalairfare;
      this.preticketingdays = preticketingdays;
      this.withairsegment = withairsegment;
      this.channel = channel;
      this.processmaster = processmaster;
      this.fee = fee;
      this.card = card;
      this.airsegment = airsegment;
      this.carsegment = carsegment;
      this.feesource = feesource;
      this.daysinadvance = daysinadvance;
   }

}