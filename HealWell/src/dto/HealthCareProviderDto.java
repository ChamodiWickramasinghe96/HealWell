package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HealthCareProviderDto {
    String provider_ID;
    String provider_Name;
    String title;
    String contactNo;

}
