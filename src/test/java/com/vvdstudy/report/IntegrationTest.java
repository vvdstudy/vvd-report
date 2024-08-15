package com.vvdstudy.report;

import com.vvdstudy.report.config.AsyncSyncConfiguration;
import com.vvdstudy.report.config.EmbeddedKafka;
import com.vvdstudy.report.config.EmbeddedSQL;
import com.vvdstudy.report.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { VvdReportApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
