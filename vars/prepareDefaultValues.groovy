import com.sap.piper.GenerateDocumentation
import com.sap.piper.DefaultValueCache
import com.sap.piper.MapUtils

import groovy.transform.Field

@Field STEP_NAME = getClass().getName()

@Field Set GENERAL_CONFIG_KEYS = []
@Field Set STEP_CONFIG_KEYS = []
@Field Set PARAMETER_KEYS = []

/**
 * Loads the pipeline library default values from the file `resources/default_pipeline_environment.yml`.
 * Afterwards the values can be loaded by the method: `ConfigurationLoader.defaultStepConfiguration`
 */
@GenerateDocumentation
void call(Map parameters = [:]) {
    println("now defaultvaluecache will be prepared")
    if(parameters.customDefaults){
        this.println("thats customdefautlts size in prepdefvalues: ")
        this.println(this.commonPipelineEnvironment.configuration.customDefaults.size())
    }

    DefaultValueCache.prepare(this, parameters)
}
