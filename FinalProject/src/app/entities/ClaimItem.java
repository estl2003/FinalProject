package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ClaimItem {

	
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column
	    private Long id;
	    
	    @NotNull
	    @Column
	    private String itemName;
	    
	    @NotNull
	    @Column
	    private String claimDate;
	    
	    @NotNull
	    @Column
	    private String claimantName;
	    
	    @NotNull
	    @Column
	    private String contactInfo;
	    
	    @Column
	    private String status; // For example: "Pending", "Approved", "Rejected"

	    @Column
	    private double latitude;
	    
	    @Column
	    private double longitude;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getClaimDate() {
			return claimDate;
		}

		public void setClaimDate(String claimDate) {
			this.claimDate = claimDate;
		}

		public String getClaimantName() {
			return claimantName;
		}

		public void setClaimantName(String claimantName) {
			this.claimantName = claimantName;
		}

		public String getContactInfo() {
			return contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public double getLongitude() {
			return longitude;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}

		@Override
		public String toString() {
			return "ClaimItem [id=" + id + ", itemName=" + itemName + ", claimDate=" + claimDate + ", claimantName="
					+ claimantName + ", contactInfo=" + contactInfo + ", status=" + status + ", latitude=" + latitude
					+ ", longitude=" + longitude + "]";
		}
	
		
	
	
	
}
