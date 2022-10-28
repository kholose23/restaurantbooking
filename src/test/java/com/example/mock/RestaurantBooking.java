package com.example.mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.example.persistence.domain.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = "classpath:person-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class RestaurantBooking {
	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

/*	private final Customer TEST_Customer = new Customer("kholose2000@gmamail,78549687497,Matla23,Matl12,"Edith");

	private final Customer TEST_SAVED_Booking = new Customer(customer id,String,);

	@Test
	public void testCreate() throws JsonProcessingException, Exception {
		String resultString = this.mockMVC
				.perform(post("/person/create").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(TEST_Customer)))
				.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();

		Customer result = this.mapper.readValue(resultString, Person.class);
		assertThat(result).isEqualTo(TEST_Customer);
	}

	@Test
	public void testReadOne() throws Exception {
		this.mockMVC.perform(get("/person/read/1")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_Customer)));

	}

	@Test
	public void testZZZ() throws Exception {
		final List<Person> PEOPLE = new ArrayList<>();
		PEOPLE.add(TEST_SAVED_PERSON);

		final String resultString = this.mockMVC
				.perform(request(HttpMethod.GET, "/person/readAll").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		List<Person> results = Arrays.asList(mapper.readValue(resultString, Person[].class));
		assertThat(results).contains(this.TEST_PERSON).hasSize(3);
	}

	@Test
	public void testUpdate() throws Exception {
		final Customer newPerson = new Customer(null, 26, "Chris Perrins");
		String resultString = this.mockMVC
				.perform(put("/person/update/3").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(newPerson)))
				.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

		Person result = this.mapper.readValue(resultString, Person.class);
		assertThat(result).isEqualTo(newPerson);
	}*/

	@Test
    public void testDelete() throws Exception {
        this.mockMVC.perform(delete("/customers/delete/2")).andExpect(status().isNoContent());
    }
}


