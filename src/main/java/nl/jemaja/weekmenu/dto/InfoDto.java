/**
 * 
 */
package nl.jemaja.weekmenu.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yannick.tollenaere
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InfoDto {
	private String body;
	private String type;
	private String from;
	private String to;

}
