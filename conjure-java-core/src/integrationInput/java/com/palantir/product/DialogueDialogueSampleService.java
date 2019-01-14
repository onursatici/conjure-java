package com.palantir.product;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.palantir.conjure.java.serialization.ObjectMappers;
import com.palantir.dialogue.Call;
import com.palantir.dialogue.Calls;
import com.palantir.dialogue.Channel;
import com.palantir.dialogue.Deserializer;
import com.palantir.dialogue.Deserializers;
import com.palantir.dialogue.DialogueOkHttpErrorDecoder;
import com.palantir.dialogue.Endpoint;
import com.palantir.dialogue.Exceptions;
import com.palantir.dialogue.HttpMethod;
import com.palantir.dialogue.OkHttpErrorDecoder;
import com.palantir.dialogue.PathTemplate;
import com.palantir.dialogue.Request;
import com.palantir.dialogue.Serializer;
import com.palantir.dialogue.Serializers;
import com.palantir.tokens.auth.AuthHeader;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Void;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("com.palantir.conjure.java.services.dialogue.DialogueClientGenerator")
public final class DialogueDialogueSampleService {
    private static final ObjectMapper mapper = ObjectMappers.newClientObjectMapper();

    private static final Endpoint<Void, String> string =
            new Endpoint<Void, String>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("string")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<String> deserializer =
                        Deserializers.jackson(
                                "string",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<String>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<String> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Void, String> stringEcho =
            new Endpoint<Void, String>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("stringEcho")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<String> deserializer =
                        Deserializers.jackson(
                                "stringEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<String>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<String> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Void, Integer> integer =
            new Endpoint<Void, Integer>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("integer")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<Integer> deserializer =
                        Deserializers.jackson(
                                "integer",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<Integer>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<Integer> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Void, Integer> integerEcho =
            new Endpoint<Void, Integer>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("integerEcho"),
                                        PathTemplate.Segment.variable("integer")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<Integer> deserializer =
                        Deserializers.jackson(
                                "integerEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<Integer>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<Integer> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Void, String> queryEcho =
            new Endpoint<Void, String>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("queryEcho")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<String> deserializer =
                        Deserializers.jackson(
                                "queryEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<String>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<String> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Void, Complex> complex =
            new Endpoint<Void, Complex>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("complex")));

                private final Serializer<Void> serializer = Serializers.failing();;

                private final Deserializer<Complex> deserializer =
                        Deserializers.jackson(
                                "complex",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<Complex>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.GET;
                }

                @Override
                public Serializer<Void> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<Complex> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<Complex, Complex> complexEcho =
            new Endpoint<Complex, Complex>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("complexEcho")));

                private final Serializer<Complex> serializer =
                        Serializers.jackson(
                                "complexEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper);;

                private final Deserializer<Complex> deserializer =
                        Deserializers.jackson(
                                "complexEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper,
                                new TypeReference<Complex>() {});;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.POST;
                }

                @Override
                public Serializer<Complex> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<Complex> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private static final Endpoint<String, InputStream> binaryEcho =
            new Endpoint<String, InputStream>() {
                private final PathTemplate pathTemplate =
                        PathTemplate.of(
                                ImmutableList.of(
                                        PathTemplate.Segment.fixed("base"),
                                        PathTemplate.Segment.fixed("binaryEcho")));

                private final Serializer<String> serializer =
                        Serializers.jackson(
                                "binaryEcho",
                                com.palantir.product.DialogueDialogueSampleService.mapper);;

                private final Deserializer<InputStream> deserializer = Deserializers.passthrough();;

                @Override
                public String renderPath(Map<String, String> params) {
                    return pathTemplate.fill(params);
                }

                @Override
                public HttpMethod httpMethod() {
                    return HttpMethod.POST;
                }

                @Override
                public Serializer<String> requestSerializer() {
                    return serializer;
                }

                @Override
                public Deserializer<InputStream> responseDeserializer() {
                    return deserializer;
                }

                @Override
                public OkHttpErrorDecoder errorDecoder() {
                    return DialogueOkHttpErrorDecoder.INSTANCE;
                }
            };

    private DialogueDialogueSampleService() {}

    /** Creates a synchronous/blocking client for a DialogueSampleService service. */
    public static BlockingDialogueSampleService blocking(Channel channel) {
        return new BlockingDialogueSampleService() {
            public String string(AuthHeader authHeader) {
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<String> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.string,
                                _request);
                ListenableFuture<String> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public String stringEcho(AuthHeader authHeader, String string) {
                Preconditions.checkNotNull(string, "parameter string must not be null");
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putHeaderParams("Header-String", Objects.toString(string))
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<String> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.stringEcho,
                                _request);
                ListenableFuture<String> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public int integer(AuthHeader authHeader) {
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<Integer> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.integer,
                                _request);
                ListenableFuture<Integer> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public int integerEcho(AuthHeader authHeader, int integer) {
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putPathParams("integer", Objects.toString(integer))
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<Integer> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.integerEcho,
                                _request);
                ListenableFuture<Integer> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public String queryEcho(AuthHeader authHeader, int integer) {
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putQueryParams("queryParam", Objects.toString(integer))
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<String> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.queryEcho,
                                _request);
                ListenableFuture<String> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public Complex complex(AuthHeader authHeader) {
                Request.Builder<Void> _request_builder =
                        Request.<Void>builder()
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Void> _request = _request_builder.build();
                Call<Complex> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.complex,
                                _request);
                ListenableFuture<Complex> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public Complex complexEcho(AuthHeader authHeader, Complex complex) {
                Preconditions.checkNotNull(complex, "parameter complex must not be null");
                Request.Builder<Complex> _request_builder =
                        Request.<Complex>builder()
                                .body(complex)
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<Complex> _request = _request_builder.build();
                Call<Complex> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.complexEcho,
                                _request);
                ListenableFuture<Complex> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }

            public InputStream binaryEcho(AuthHeader authHeader, String string) {
                Preconditions.checkNotNull(string, "parameter string must not be null");
                Request.Builder<String> _request_builder =
                        Request.<String>builder()
                                .body(string)
                                .putHeaderParams("Authorization", Objects.toString(authHeader));
                Request<String> _request = _request_builder.build();
                Call<InputStream> _call =
                        channel.createCall(
                                com.palantir.product.DialogueDialogueSampleService.binaryEcho,
                                _request);
                ListenableFuture<InputStream> _response = Calls.toFuture(_call);
                try {
                    return _response.get();
                } catch (Throwable _throwable) {
                    throw Exceptions.unwrapExecutionException(_throwable);
                }
            }
        };
    }
}